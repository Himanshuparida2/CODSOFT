function generateCertificate() {
    let name = document.getElementById('name').value;
    let course = document.getElementById('course').value;

    let canvas = document.getElementById('certificateCanvas');
    let ctx = canvas.getContext('2d');

    canvas.width = window.innerWidth;
    canvas.height = window.innerHeight;

    ctx.fillStyle = '#ffffff';
    ctx.fillRect(0, 0, canvas.width, canvas.height);

    ctx.font = 'bold 5vw Arial'; // Adjust font size based on viewport width
    ctx.fillStyle = '#000000';
    ctx.fillText('Certificate of Completion', canvas.width * 0.1, canvas.height * 0.2);

    ctx.font = 'bold 3vw Arial'; // Adjust font size based on viewport width
    ctx.fillText('This is to certify that', canvas.width * 0.1, canvas.height * 0.35);
    ctx.fillText(name, canvas.width * 0.1, canvas.height * 0.45);
    ctx.fillText('has successfully completed the course', canvas.width * 0.1, canvas.height * 0.55);
    ctx.fillText(course, canvas.width * 0.1, canvas.height * 0.65);

    // Show download link
    var downloadLink = document.getElementById('downloadLink');
    downloadLink.style.display = 'block';
    // Convert canvas content to image and set it as href for download link
    downloadLink.href = canvas.toDataURL('image/png');
}