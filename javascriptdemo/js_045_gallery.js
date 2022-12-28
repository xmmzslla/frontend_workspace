// js_045_gallery.js

//1. 큰이미지 나오게

let bigphoto = document.querySelector('#photo > img');
// #photo > img = 아이디 photo 안의 img
// console.log(bigphoto.scr);
console.log(bigphoto);

let list_zone = document.querySelector('ul#inner_list');
/*칠드런 안하고 이걸로 할 수 있음('ul#inner_list > li');*/
let ul_li = list_zone.children;
console.log(ul_li); //HTMLCollection(8)

ul_li = [...ul_li];
ul_li.map((liTag, idx) => {
  let aTag = liTag.querySelector('a');
  //li테그에 있는 것 중에 a라는 요소를 가져와라
  aTag.onclick = (e) => {
    bigphoto.src = aTag.href;
    return false; // = e.preventDefault()
  };
});

// 2. 다음(>)버튼을 클릭할 때마다 <li>이 100만큼 이동하게 한다.
let m_num = 0;
let next_btn = document.querySelector('#next_btn');
next_btn.onclick = (e) => {
  m_num++;
  if (m_num >= ul_li.length - 3) return false;
  list_zone.style.marginLeft = -100 * m_num + 'px';
  return false; //e.preventDefault()
};

// 3. 이전(<)버튼을 클릭할 때마다 <li>이 100만큼 이동하게 한다.
let before_btn = document.querySelector('#before_btn');
before_btn.onclick = (e) => {
  if (m_num <= 0) return false;
  m_num--;
  list_zone.style.marginLeft = -100 * m_num + 'px';
  return false; //e.preventDefault()
};
