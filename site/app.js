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
$(window).scroll(function () {
    var scrollTop = $(this).scrollTop();
    var elementPos = $('.one').offset().top;
    var winHeight = $(window).height();
    var elemHeight = $('.one').height();
    console.log("scroll top: " + scrollTop);
    console.log("elementPos: " + elementPos);
    console.log("winHeight: " + winHeight);
    console.log("heightElem: " + elemHeight);
    $('.one').css({
        opacity: function () {
            var elementHeight = $(this).height(),
                //full opacity when scrollTop reaches elementHeight because div starts scrollTop pixels away from top origin
                opacity = ((1 - (elementHeight - scrollTop) / (elementHeight)) * 0.8) + 0.2;

            // console.log("element height" + elementHeight);
            // console.log("scroll top" + scrollTop);

            return opacity;
        }
    });

    $('.one').css({
        transform: function () {
            var elementHeight = $(this).height(),
                scale = Math.min(1, ((1 - (elementHeight - scrollTop) / elementHeight) * 0.8) + 0.2);
            scale *= 0.1;
            console.log(scale);
            return `scale3d(${0.9 + scale}, ${0.9 + scale}, ${1})`
        }
    });
});


$(window).scroll(function () {
    var scrollTop = $(this).scrollTop();
    $('.two').css({
        opacity: function () {
            var elementHeight = $(this).height(),
                //because under the first animated div, of same size, need to account for its height offset along with its 2vh margin from the  bottom fo first div
                opacity = ((1 - (elementHeight - (scrollTop - elementHeight - 2 * vh)) / elementHeight) * 0.8) + 0.2;
            return opacity;
        }
    });


    $('.two').css({
        transform: function () {
            var elementHeight = $('.two').height(),
                scale = Math.min(1, ((1 - (elementHeight - (scrollTop - elementHeight - 2 * vh)) / elementHeight) * 0.8) + 0.2);
            scale *= 0.1;
            return `scale3d(${0.9 + scale}, ${0.9 + scale}, ${1})`
        }
    });
});

$(window).scroll(function () {
    var scrollTop = $(this).scrollTop();
    $('.three').css({
        opacity: function () {
            var elementHeight = $(this).height(),
                opacity = ((1 - (elementHeight - (scrollTop - elementHeight * 2 - 4 * vh)) / elementHeight) * 0.8) + 0.2;
            return opacity;
        }
    });


    $('.three').css({
        transform: function () {
            var elementHeight = $('.two').height(),
                //4vh to account for the last two 2vh margin-bottoms of the last 2 animated divs
                scale = Math.min(1, ((1 - (elementHeight - (scrollTop - elementHeight * 2 - 4 * vh)) / elementHeight) * 0.8) + 0.2);
            scale *= 0.1;
            return `scale3d(${0.9 + scale}, ${0.9 + scale}, ${1})`
        }
    });
});

$(".one").scrollTop(700);