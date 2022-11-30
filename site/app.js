const observer = new IntersectionObserver((entries) => {
    entries.forEach((entry) => {
        console.log(entry)
        if (entry.isIntersecting) { //Intersecting the cleint's viewport
            entry.target.classList.add('show');
        } else {
            entry.target.classList.remove('show');
        }
    })
})

const hiddenElements = document.querySelectorAll(".hidden")
hiddenElements.forEach((el) => observer.observe(el));