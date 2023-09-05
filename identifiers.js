var a = 15;    // var can be redclared and its value can be changed adywhere.
let b = 13;
const c = 12;
var a = 45;
//let b = 89;     let can not be redclared.
b = 57;
// c = 89;  it is wrong const cannot be redclared and reassigned.
{
    var a = "this";    
    let b = "sanjay";
    const c = 67;      // block level scope.
    console.log(a,b,c);
}
console.log(a,b,c);