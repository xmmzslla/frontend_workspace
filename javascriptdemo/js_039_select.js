// js_039_select.js

document.frm.onsubmit = () => {
  let optFruit = document.querySelector('#sel');
  console.log(optFruit);

  let optSelect = optFruit.selectedIndex + ' ' + optFruit.value;
  console.log(optFruit);

  return false;
};
