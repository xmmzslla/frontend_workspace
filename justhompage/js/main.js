//  main.js

////////////////////////
// 슬라이드 기능 구현
////////////////////////

setInterval(function () {
  let tg = document.querySelector('.slide');
  tg.style.top = '-100%';
  tg.style.transition = '0.6s';

  setTimeout(function () {
    let first = tg.querySelectorAll('li')[0];
    tg.appendChild(first); //이미지가 반복해서 돌아가도록 올라간 이미지를 밑으로 내려준다
    tg.style.top = '0';
    tg.style.transition = 'none'; //0.6을 없앰
  }, 600); //0.6초 후에 위의4가지 작업들이 이루어진다
}, 3000); //3초 동안 실행

/////////////////////////
// 탭변경 변경하기
/////////////////////////
function chgTab(i1, i2) {
  // 탭메뉴
  let tm = document.querySelectorAll('.tm>li');

  //탭내용
  let tc = document.querySelectorAll('.tc>li');

  //   클래스 추가
  tm[i1].classList.add('on'); //갤러리에 추가
  tc[i1].classList.add('on');

  //   클래스 제거
  tm[i2].classList.remove('on');
  tc[i2].classList.remove('on');
}
