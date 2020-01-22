printSet=function(set){
    console.log(`we have ${set.size} element(s)`);
    for(let ele of set){
        console.log(ele);
    }
}
var set1=new Set();
set1.add("ant");
set1.add("elephant");
set1.add("lion");
printSet(set1);
set1.delete("lion");
set1.clear();
printSet(set1);