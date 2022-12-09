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
    if (prevScrollpos > currentScrollPos) {
        document.getElementsByClassName("navbar")[0].style.top = "0";
    } else {
        document.getElementsByClassName("navbar")[0].style.top = "-50px";
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
        x.style.background = "rgba(0, 0, 0, 0.8)";
    }
}

function hideDrop() {
    var x = document.getElementById("nav-panel");
    x.style.display = "none";
}



// function toggleNavPanel() {

// }


