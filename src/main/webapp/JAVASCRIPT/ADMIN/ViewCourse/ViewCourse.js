/**
 * 
 */$(document).ready(function () {
    $('.link_name').click(function () {
        $('.modal-box').toggleClass("show-modal");
        $('.link_name').toggleClass("show-modal");
    });
    $('.fa-times').click(function () {
        $('.modal-box').toggleClass("show-modal"); 
        $('.link_name').toggleClass("show-modal");
    });
});