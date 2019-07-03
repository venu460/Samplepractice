function cached(url) {
    var test = document.createElement("img");
    test.src = url;
    return test.complete || test.width+test.height > 0;
}