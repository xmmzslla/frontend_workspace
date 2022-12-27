// js_035_dom.js

let myNode = document.getElementById('p2');
console.log(myNode);
// myNode: [object HTMLParagraphElement]
console.log(`myNode: ${myNode}`);

let ptNode = myNode.parentNode; //(div)
// div#wrqp
console.log(ptNode);
// ptNode: [object HTMLDivElement]
console.log(`ptNode: ${ptNode}`);

ptNode.style.color = 'blue';
//////////////////////////////////////
// previousSibling : prevNode만 검색해서 가져온다
let prevNode = myNode.previousSibling;
console.log(`prevNode: ${prevNode}`);

prevNode = prevNode.previousSibling;
console.log(prevNode);
// prevNode: [object HTMLParagraphElement]
console.log(`prevNode: ${prevNode}`);
/////////////////////////////////////////
// previousElementSibling : prevElementNode만 검색한다
let prevElementNode = myNode.previousElementSibling;
console.log(prevElementNode);
console.log(`${prevElementNode}`);

/////////////////////////////////////////
// nextSibling
let nextNode = myNode.nextSibling;
// []
console.log(`${nextNode}`);

nextNode = nextNode.nextSibling;
// <p id = "p3">content3</p>
console.log(nextNode);
// [object HTMLParagraphElement]
console.log(`${nextNode}`);

//////////////////////////////////////
// nextElementSibling
let nextElementSibling = myNode.nextElementSibling;
// [object HTMLParagraphElement]
console.log(`${nextElementSibling}`);

/////////////////////////////////////////
// childNodes

let divNode = document.getElementById('wrap');
//
console.log(`${divNode}`);

let divChilesNode = divNode.ChildNodes;
console.log(`divChilesNode`);

////////////////////////////////
// children
let divChildren = divNode.children;
console.log(`${divChildren}`);

console.log(divChildren);

let p4Node = document.querySelector('#p4');
//
console.log(p4Node);
console.log(`${p4Node}`);

let aNode = p4Node.firstElementChild;
console.log(aNode);
console.log(`${aNode}`);

///////////////////////
// 객체.getAttribute('속성명'), 객체.setAttribute('속성명', '값')
// 객체.속성명,  객체.속성명 = '값'

let aAttrNode = aNode.getAttribute('src');
console.log(aAttrNode);

aAttrNode = aNode.scr;
//
console.log(aAttrNode);

aNode.setAttribute('title', '스타배우');

aNode.id = 'imgGosu';

let aAttrList = aNode.getAttributeNode;
console.log(aAttrList.length);

console.log(aAttrList);
