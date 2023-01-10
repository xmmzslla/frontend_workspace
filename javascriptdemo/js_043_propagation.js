// js_043_propagation.js

document.querySelector(".red").onclick = (e) => {
  alert("red");
  e.stopPropagation();
};

document.querySelector(".green").onclick = (e) => {
  alert("green");
  e.stopPropagation(); //이벤트 전파 차단
};

document.querySelector(".blue").onclick = (e) => {
  alert("blue");
  e.stopPropagation();
};

document.querySelector("a").onclick = (e) => {
  alert("안녕하세요");
  // e.preventDefault(); //이벤트 차단 페이지 이동 불가
  return false; // = e.preventDefault()
};

/* 
[1] Event Progapation(이벤트 전파)
1. 캡쳐링(capturing phase) : 부모요소에서 Target요소로 이벤트 전파
2. 버블링(bubbling phase) : Target요소에서 부모요소로 이벤트 전파

[2]이벤트 차단
stopPropagation()

[3] stopPropagation()과 preventDefault()비교
stopPropagation() : 이벤트 전파 차단 return false(jQuery)
preventDefault() : 디폴트 이벤트 차단 return false(javascript, jQuery)

https://www.w3schools.com/jsref/event_preventdefault.asp
http://developer.mozilla.org/en-US/docs/Web/API/Event/stopPropagation
*/
