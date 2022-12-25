const observer = new IntersectionObserver((entries) => {
    entries.forEach((entry) => {
        // console.log(entry)
        if (entry.isIntersecting) { //Intersecting the cleint's viewport
            entry.target.classList.add('show');
        } else {
            entry.target.classList.remove('show');
        }
    })
})

let vh = window.innerHeight * 0.01,
    vw = window.innerWidth * 0.01;

const hiddenElements = document.querySelectorAll(".hidden")
hiddenElements.forEach((el) => observer.observe(el));
let windowSize = $(window).outerHeight();
var winHeight = $(window).height();


//a function that will change a div's opacity and scale based on its position in the viewport    
function animateDivs() {
    //get the height of the window
    var winHeight = $(window).height();
    //for each div with the class of 'animate'      
    $('.panel').each(function () {
        //get the position of the div from the top of the page
        var fromTop = $(this)[0].getBoundingClientRect().top;
        //get the height of the div
        var elementHeight = $(this).outerHeight();
        //calculate the opacity of the div based on its position in the viewport
        var opacity = (((Math.max(0, winHeight - fromTop)) / (elementHeight)) * 0.8) + 0.2;
        //calculate the scale of the div based on its position in the viewport
        var scale = Math.min(1, (((Math.max(0, winHeight - fromTop)) / (elementHeight)) * 0.8) + 0.2);
        //set the opacity and scale of the div
        scale *= 0.1;
        $(this).css({
            opacity: opacity,
            transform: 'scale3d(' + (scale + 0.9) + ',' + (scale + 0.9) + ',1)'
        });
    })

    $('.deck').each(function () {
        //get the position of the div from the top of the page
        var fromTop = $(this)[0].getBoundingClientRect().top;
        //get the height of the div
        var elementHeight = $(this).outerHeight();
        //calculate the opacity of the div based on its position in the viewport
        var opacity = (((Math.max(0, winHeight - fromTop)) / (elementHeight)) * 0.8) + 0.2;
        //calculate the scale of the div based on its position in the viewport
        var scale = Math.min(1, (((Math.max(0, winHeight - fromTop)) / (elementHeight)) * 0.8) + 0.2);
        //set the opacity and scale of the div
        scale *= 0.1;
        $(this).css({
            opacity: opacity,
            transform: 'scale3d(' + (scale + 0.9) + ',' + (scale + 0.9) + ',1)'
        });
    })
};
//call the animateDivs function on scroll   
$(window).scroll(animateDivs);

var prevScrollpos = window.pageYOffset;
window.onscroll = function () {
    var currentScrollPos = window.pageYOffset;
    if (prevScrollpos >= currentScrollPos || window.scrollY <= 30) {
        document.getElementsByClassName("navbar")[0].style.top = "0";
    } else {
        document.getElementsByClassName("navbar")[0].style.top = "-50px";
        document.getElementById("nav-panel").style.display = "none";
    }
    prevScrollpos = currentScrollPos;
}

function toggleNavPanel() {
    var x = document.getElementById("nav-panel");
    if (x.style.display === "flex") {
        x.style.display = "none";
    } else {
        x.style.display = "flex";
        x.style.flexDirection = "column";
    }
}

function hideDrop() {
    var x = document.getElementById("nav-panel");
    x.style.display = "none";
}

const form = document.getElementById('contact-form');
const errorMessage = document.getElementById('error-message');

form.addEventListener('submit', (event) => {
    event.preventDefault();
    const name = form.elements.name.value;
    const email = form.elements.email.value;
    const phone = form.elements.phone.value;
    const message = form.elements.message.value;

    if (!name || !(email || phone)) {
        errorMessage.style.visibility = 'visible';
    } else {
        // Form is valid, so you can submit it or do other actions here
        errorMessage.style.display = 'none';
        var params = {
            name, email, phone, message,
        };
        sendMail(params)
    }

});

function sendMail(clientInfo) {
    const serviceID = "service_35xmzqh";
    const templateID = "template_yjp18mm";
    emailjs.send(serviceID, templateID, clientInfo).then(response => {
        document.getElementById("name").value = "";
        document.getElementById("email").value = "";
        document.getElementById("phone").value = "";
        document.getElementById("message").value = "";
        console.log(response);
        alert("your message sent successfully");

    }).catch(err => console.log(err));
}





