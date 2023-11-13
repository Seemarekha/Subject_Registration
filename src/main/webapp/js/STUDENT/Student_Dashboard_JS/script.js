// var swiper = new Swiper(".slide-content", {
//     slidesPerView: 1,
//     centeredSlides: false,
//     slidesPerGroupSkip: 1,
//     grabCursor: true,
//     keyboard: {
//       enabled: true,
//     },
//     breakpoints: {
//       769: {
//         slidesPerView: 2,
//         slidesPerGroup: 2,
//       },
//     },
//     scrollbar: {
//       el: ".swiper-scrollbar",
//     },
//     navigation: {
//       nextEl: ".swiper-button-next",
//       prevEl: ".swiper-button-prev",
//     },
//     pagination: {
//       el: ".swiper-pagination",
//       clickable: true,
//     },
//   });


var swiper = new Swiper (".slide-content", {
    slidesPerView: 3,
    spaceBetween: 25,
    slidesPerGroup: 3,
    loop: true,
    loopFillGroupwithBlank: true,
    pagination: {
      el: ".swiper-pagination",
      clickable: true,
    },
    navigation: {
      nextEl: ".swiper-button-next",
      prevel: ".swiper-button-prev",
    },

    breakpoints:{
        0:{
            slidesPerView: 1
        },
        560:{
            slidesPerView: 2
        },
        950:{
            slidesPerView: 3
        }
    }
  });