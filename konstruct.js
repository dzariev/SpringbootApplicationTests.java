let box = document.querySelector('.services__content')
let array = [
  {
    icon: './img/card1.svg',
    title: 'PROJECT AND CONSTRUCTION MANAGEMENT',
    description: 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibheuismod tincidunt ut laoreet dolore magna aliquam erat.',
    id: 0
  },
  {
    icon: './img/card2.svg',
    title: 'STRUCTURE AUDIT AND MAINTENANCE',
    description: 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibheuismod tincidunt ut laoreet dolore magna aliquam erat.',
    id: 0
  },
  {
    icon: './img/card3.svg',
    title: 'FACTORY CONSTRUCTION AND MODELING',
    description: 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibheuismod tincidunt ut laoreet dolore magna aliquam erat.',
    id: 0
  }
]

let content = ''
for (let i = 0; i < array.length; i++) {
  content += `<div class="services__card card">
            <img class="card__icon" src="${array[i].icon}" alt="card icon book">
            <h3 class="card__title">${array[i].title}</h3>
            <p class="card__desc">${array[i].description}</p>
          </div>`
}
box.innerHTML = content;

const menuBtn = document.querySelector('.menu__btn')
const menu = document.querySelector('.menu')

menuBtn.addEventListener('click', () => {
  // menuBtn.addEventListener('menu--show')
  menu.classList.toggle('menu--show')
  console.log(menuBtn)
})
