let icon = document.getElementById("icon")
icon.addEventListener("click", function () {
    const ul = document.getElementsByClassName("menu-list")[0];
    if (ul.classList.contains("show")) {
        ul.classList.remove("show");
    } else {
        ul.classList.add("show");
    }
})