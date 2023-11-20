/**
 * 
 */
function toggleReadMore() {
  var paragraph = document.getElementById('paragraph');
  var btn = document.getElementById('readMoreBtn');

  if (paragraph.style.maxHeight) {
    paragraph.style.maxHeight = null;
    btn.textContent = 'Read Less';
  } else {
    paragraph.style.maxHeight = '100px'; // Adjust the height as needed
    btn.textContent = 'Read More';
  }
}
