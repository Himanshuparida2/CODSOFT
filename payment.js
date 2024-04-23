function addOptions() {
    let select = document.getElementById("paymentMethod");
    let selectedValue = select.value;
    let additionalOptionsDiv = document.getElementById("additionalOptions");

    if (selectedValue === "Debit/Credit-Card") {
        additionalOptionsDiv.innerHTML = `
            <div class="inner-element">
                <label for="cardType">Select Card:</label>
                <select class="card-type-option">
                    <option value="Select">Select</option>
                    <option value="Rupay">Rupay</option>
                    <option value="Visa">Visa</option>
                    <option value="MasterCard">MasterCard</option>
                </select><br>
                <div class="card-details">
                  <label for="CardNo">Card No:</label>
                  <input class="card" type="number" placeholder="Enter Your Card No..." required>
                  <label for="Expiry-date">Expiry Date:</label>
                  <input class="card" type="date" placeholder="Enter Your Expiry Date..." required>
                  <label for="CVV">CVV:</label>
                  <input class="card" type="number" placeholder="Enter Your CVV..." required>
                </div>
            </div>
        `;
    } 
    else if(selectedValue=="UPI"){
        additionalOptionsDiv.innerHTML = `
        <div class="inner-element">
          <label for="UPIno">UPI No:</label>
          <input class="upi" type="number" placeholder="Enter UPI No..." required>
        </div>
        `;
    }
}
function redirectCourse(){
    let course=document.querySelector("#Course");
    let c=course.value;
    if(c=="Web Development"){
    window.location.href="webcourse.html"
    }
    else if(c=="Software Development"){
        window.location.href="softcourse.html"
    }
    else if(c=="Programming Languages"){
        window.location.href="progcourse.html"
    }
    else{
        window.location.href="designcourse.html"
    }
};
