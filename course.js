function track() {
    var iframe = document.getElementById('video-frame');
    var progressBar = document.getElementById('progress-bar');

    iframe.onload = function() {
        setInterval(updateProgressBar, 1000);
    };

    function updateProgressBar() {
        var iframeWindow = iframe.contentWindow;
        var video = iframeWindow.document.querySelector('video');

        if (video) {
            var currentTime = video.currentTime;
            var duration = video.duration;
            var progress = (currentTime / duration) * 100;

            progressBar.style.width = progress + '%';
            if(progress==100){
                window.location.href="certificate.html";
            }
        }
    }
};
track();
setInterval(function(){
    window.location.href="certificate.html"
},170000)