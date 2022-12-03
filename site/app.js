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

const hiddenElements = document.querySelectorAll(".hidden")
hiddenElements.forEach((el) => observer.observe(el));

$(window).scroll(function () {
    var scrollTop = $(this).scrollTop();
    $('.panel').css({
        opacity: function () {
            var elementHeight = $(this).height(),
                opacity = ((1 - (elementHeight - scrollTop) / elementHeight) * 0.8) + 0.2;

            console.log("element height" + elementHeight);
            return opacity;
        }
    });
});