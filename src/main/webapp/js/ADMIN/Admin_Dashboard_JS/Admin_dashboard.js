
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