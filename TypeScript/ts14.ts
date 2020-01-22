interface Person {
    name : string;
    age : number;
    toString : () => string;
}

interface Student extends Person {
    course : string;
}

function printt(v : Person) : void {
    console.log(v.toString());
}

let p1 : Person = {
    name : "Bala",
    age : 21,
    toString : function() {
        return this.name + " : " + this.age;
    }
};

printt(p1);
let s1 : Student = {
    name : "DurgaS",
    age : 20,
    course : "Angular",
    toString : function() {
        return this.name + " - " + this.age + " - " + this.course;
    }
}

printt(s1);