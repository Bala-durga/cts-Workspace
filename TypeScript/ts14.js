function printt(v) {
    console.log(v.toString());
}
var p1 = {
    name: "Bala",
    age: 21,
    toString: function () {
        return this.name + " : " + this.age;
    }
};
printt(p1);
var s1 = {
    name: "DurgaS",
    age: 20,
    course: "Angular",
    toString: function () {
        return this.name + " - " + this.age + " - " + this.course;
    }
};
printt(s1);
