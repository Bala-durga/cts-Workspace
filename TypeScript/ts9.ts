// rest parameters (varargs)
function prin(message : string, ...names:string[]) {
    for(let n of names) {
        console.log(message + " " + n);
    }
}

prin("Hello ", "John", "Deo");
prin("Hai ", "Anders Hejlsberg", "Rod Jhonson", "Bjarne Stroustrup", "Dennis Ritchie");