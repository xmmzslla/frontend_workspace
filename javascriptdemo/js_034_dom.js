//  js_034_dom.js

let hNode = document.getElementById('selector');
console.log(hNode);
console.log(hNode, typeof hNode);

let hId = document.querySelector('#selector');
console.log(hId, typeof hId);

let hClass = document.querySelector('.choice');
// alert(hClass);
console.log(hClass, typeof hClass);

// HTMLCollection(4)
let pNode = document.getElementsByTagName('p');
console.log(typeof pNode);
console.log(pNode.length);
console.log(pNode[0]);
console.log(pNode.item(0));
console.log(pNode[0].innerText);
pNode[0].style.color = 'red';
pNode[0].style.backgroundColor = 'blue';

function process() {
  let fname = document.frm.fname;
  console.log('fname:', fname);
  console.log(fname.value);
  console.log(fname.defaultValue);

  return false;
}
