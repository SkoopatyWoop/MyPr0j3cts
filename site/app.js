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

// $(window).scroll(function () {
//     var scrollTop = $(this).scrollTop();
//     var elementPos = $('.one').offset().top;
//     var elemHeight = $('.one').height();
//     console.log("scroll top: " + scrollTop);
//     console.log("elementPos: " + elementPos);
//     console.log("winHeight: " + winHeight);
//     console.log("heightElem: " + elemHeight);
//     $('.one').css({
//         opacity: function () {
//             var fromTop = $(this)[0].getBoundingClientRect().top;
//             var elementHeight = $(this).outerHeight(),
//                 //full opacity when scrollTop reaches elementHeight because div starts scrollTop pixels away from top origin
//                 opacity = (((Math.max(0, winHeight - fromTop)) / (elementHeight)) * 0.8) + 0.2;
//             console.log("winHeight - fromTop: " + (winHeight - fromTop));
//             // console.log("element height" + elementHeight);
//             // console.log("scroll top" + scrollTop);

//             return opacity;
//         }
//     });

//     $('.one').css({
//         transform: function () {
//             var fromTop = $(this)[0].getBoundingClientRect().top;
//             var elementHeight = $(this).outerHeight(),
//                 scale = Math.min(1, (((Math.max(0, winHeight - fromTop)) / (elementHeight)) * 0.8) + 0.2);
//             scale *= 0.1;
//             console.log(scale);
//             return `scale3d(${0.9 + scale}, ${0.9 + scale}, ${1})`
//         }
//     });
// });


// $(window).scroll(function () {
//     var scrollTop = $(this).scrollTop();
//     $('.two').css({
//         opacity: function () {
//             var fromTop = $(this)[0].getBoundingClientRect().top;
//             var elementHeight = $(this).outerHeight(),
//                 //because under the first animated div, of same size, need to account for its height offset along with its 2vh margin from the  bottom fo first div
//                 opacity = (((Math.max(0, winHeight - fromTop)) / (elementHeight)) * 0.8) + 0.2;
//             return opacity;
//         }
//     });


//     $('.two').css({
//         transform: function () {
//             var fromTop = $(this)[0].getBoundingClientRect().top;
//             var elementHeight = $(this).outerHeight(),
//                 scale = Math.min(1, (((Math.max(0, winHeight - fromTop)) / (elementHeight)) * 0.8) + 0.2);
//             scale *= 0.1;
//             return `scale3d(${0.9 + scale}, ${0.9 + scale}, ${1})`
//         }
//     });
// });

// $(window).scroll(function () {
//     var scrollTop = $(this).scrollTop();
//     $('.three').css({
//         opacity: function () {
//             var fromTop = $(this)[0].getBoundingClientRect().top;
//             var elementHeight = $(this).outerHeight(),
//                 opacity = (((Math.max(0, winHeight - fromTop)) / (elementHeight)) * 0.8) + 0.2;
//             return opacity;
//         }
//     });


//     $('.three').css({
//         transform: function () {
//             var fromTop = $(this)[0].getBoundingClientRect().top;
//             var elementHeight = $(this).outerHeight(),
//                 //4vh to account for the last two 2vh margin-bottoms of the last 2 animated divs
//                 scale = Math.min(1, (((Math.max(0, winHeight - fromTop)) / (elementHeight)) * 0.8) + 0.2);
//             scale *= 0.1;
//             return `scale3d(${0.9 + scale}, ${0.9 + scale}, ${1})`
//         }
//     });
// });


//a function that will change a div's opacity and scale based on its position in the viewport    
function animateDivs() {
    //get the height of the window
    var winHeight = $(window).height();
    //get the scrollTop position of the window
    var scrollTop = $(this).scrollTop();
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
};
//call the animateDivs function on scroll   
$(window).scroll(animateDivs);

