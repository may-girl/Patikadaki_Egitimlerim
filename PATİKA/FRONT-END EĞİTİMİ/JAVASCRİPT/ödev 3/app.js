const menu = [
  {
    id: 1,
    title: "Tteokbokki",
    category: "Korea",
    price: 10.99,
    img:
      "https://twoplaidaprons.com/wp-content/uploads/2020/09/tteokbokki-top-down-view-of-tteokbokki-in-a-bowl-500x500.jpg",
    desc: `Spicy rice cakes, serving with fish cake.`,
  },
  {
    id: 2,
    title: "Chicken Ramen",
    category: "Japan",
    price: 7.99,
    img:
      "https://www.forkknifeswoon.com/wp-content/uploads/2014/10/simple-homemade-chicken-ramen-fork-knife-swoon-01.jpg",
    desc: `Chicken noodle soup, serving with vegetables such as soy bean, green onion. In an optional you can ask for egg. `,
  },
  {
    id: 3,
    title: "Bibimbap",
    category: "Korea",
    price: 8.99,
    img:
      "https://dwellbymichelle.com/wp-content/uploads/2020/05/DWELL-bibimbap.jpg",
    desc: `Boiling vegetables, serving with special hot sauce`,
  },
  {
    id: 4,
    title: "Dan Dan Mian",
    category: "China",
    price: 5.99,
    img:
      "https://www.savingdessert.com/wp-content/uploads/2019/02/Dan-Dan-Noodles-10.jpg",
    desc: `Dan dan noodle, serving with green onion `,
  },
  {
    id: 5,
    title: "Yangzhou Fried Rice",
    category: "China",
    price: 12.99,
    img:
      "https://salu-salo.com/wp-content/uploads/2013/02/Yangzhou-Fried-Rice1.jpg",
    desc: `Yangzhou style fried rice, serving with bean and pickles `,
  },
  {
    id: 6,
    title: "Onigiri",
    category: "Japan",
    price: 9.99,
    img:
      "https://www.manusmenu.com/wp-content/uploads/2017/08/Onigiri-3-1-of-1.jpg",
    desc: `Rice Sandwich, serving with soy sauce`,
  },
  {
    id: 7,
    title: "Jajangmyeon",
    category: "Korea",
    price: 15.99,
    img:
      "https://www.curiouscuisiniere.com/wp-content/uploads/2020/04/Jajangmyeon-Korean-Noodles-in-Black-Bean-Sauce5.1200H-720x540.jpg",
    desc: `Black bean sauce noodle, serving with green onion `,
  },
  {
    id: 8,
    title: "Ma Yi Shang Shu",
    category: "China",
    price: 12.99,
    img:
      "https://assets.tmecosys.com/image/upload/t_web767x639/img/recipe/ras/Assets/F688C2F6-86EC-46C4-B9C7-A6BA01DF7437/Derivates/32E3E72A-F786-406D-AF7F-B30980A9AC6C.jpg",
    desc: `Hot pepper sauce noodle, serving with soy bean and onion`,
  },
  {
    id: 9,
    title: "Doroyaki",
    category: "Japan",
    price: 3.99,
    img:
      "https://www.justonecookbook.com/wp-content/uploads/2011/10/Dorayaki-New-500x400.jpg",
    desc: `Red bean paste dessert, serving with honey.`,
  },
];



// "All" butonu oluşturuyoruz ve HTML sayfasına ekleniyoruz
const button1 = document.createElement("button");
button1.classList.add("btn", "btn-outline-dark", "btn-item");
button1.textContent = "All"; 
button1.id = "all"; 

const container1 = document.querySelector(".btn-container"); // Butonların ekleneceği bölüm seçiliyor
container1.appendChild(button1); // Buton HTML sayfasına ekleniyor



// "Korea" butonu oluşturuyoruz ve HTML sayfasına ekleniyoruz
const button2 = document.createElement("button");
button2.classList.add("btn", "btn-outline-dark", "btn-item");
button2.textContent = "Korea"; 
button2.id = "korea"; 

const container2 = document.querySelector(".btn-container"); // Butonların ekleneceği bölüm seçiliyor
container2.appendChild(button2); // Buton HTML sayfasına ekleniyor



// "Japan" butonu oluşturuyoruz ve HTML sayfasına ekleniyoruz
const button3 = document.createElement("button");
button3.classList.add("btn", "btn-outline-dark", "btn-item");
button3.textContent = "Japan"; 
button3.id = "japan"; 

const container3 = document.querySelector(".btn-container"); // Butonların ekleneceği bölüm seçiliyor
container3.appendChild(button3); // Buton HTML sayfasına ekleniyor



// "China" butonu oluşturuyoruz ve HTML sayfasına ekleniyoruz
const button4 = document.createElement("button");
button4.classList.add("btn", "btn-outline-dark", "btn-item");
button4.textContent = "China"; 
button4.id = "china";

const container4 = document.querySelector(".btn-container"); // Butonların ekleneceği bölüm seçiliyor
container4.appendChild(button4); // Buton HTML sayfasına ekleniyor



// "All" butonuna tıklandığında tüm yemekleri gösteren fonksiyon
let allButton = document.querySelector("#all"); // "All" butonu seçiliyor
allButton.addEventListener("click", showMenu); // Butona tıklandığında showMenu fonksiyonu çağrılacak


// Yemekleri göstereceğimiz bölüm seçiliyor
const menuDiv = document.querySelector(".section-center"); // Menü bölümü seçiliyor

// Tüm yemekleri gösteren fonksiyon
function showMenu() {
  // Menüdeki her yemek için HTML kodu oluşturuyoruz
  let menuItems = menu.map((item) => {
    return `
      <div class="menu-items col-lg-6 col-sm-12">
        <img src="${item.img}" alt="${item.title}" class="photo">
        <div class="menu-info">
          <div class="menu-title">
            <h4>${item.title}</h4>
            <h4 class="price">${item.price}</h4>
          </div>
          <div class="menu-text">${item.desc}</div>
        </div>
      </div>
    `;
  });


  // Oluşturduğumuz HTML kodunu menü bölümüne ekliyoruz
  menuDiv.innerHTML = menuItems.join("");
  
}

// Sayfa açıldığında tüm yemekleri gösteriyoruz
showMenu();

// "Korea" butonuna tıklandığında sadece Kore yemeklerini gösteren fonksiyon
let koreaButton = document.querySelector("#korea"); // "Korea" butonu seçiliyor
koreaButton.addEventListener("click", koreaMenu); // Butona tıklandığında koreaMenu fonksiyonu çağrılacak

// Sadece Kore yemeklerini gösteren fonksiyon
function koreaMenu() {
  // Kore yemeklerini filtrelemek için filter() fonksiyonunu kullanıyoruz
  let koreaItems = menu.filter((item) => item.category === "Korea");

  // Filtrelenen yemekleri HTML koduna çeviriyoruz
  let menuItems = koreaItems.map((item) => {
    return `
      <div class="menu-items col-lg-6 col-sm-12">
        <img src="${item.img}" alt="${item.title}" class="photo">
        <div class="menu-info">
          <div class="menu-title">
            <h4>${item.title}</h4>
            <h4 class="price">${item.price}</h4>
          </div>
          <div class="menu-text">${item.desc}</div>
        </div>
      </div>
    `;
  });

  // Oluşturduğumuz HTML kodunu menü bölümüne ekliyoruz
  menuDiv.innerHTML = menuItems.join("");
}

// "Japan" butonuna tıklandığında sadece Japon yemeklerini gösteren fonksiyon
let japanButton = document.querySelector("#japan"); // "Japan" butonu seçiliyor
japanButton.addEventListener("click", japanMenu); // Butona tıklandığında japanMenu fonksiyonu çağrılacak

// Sadece Japon yemeklerini gösteren fonksiyon
function japanMenu() {
  // Japon yemeklerini filtrelemek için filter() fonksiyonunu kullanıyoruz
  let japanItems = menu.filter((item) => item.category === "Japan");

  // Filtrelenen yemekleri HTML koduna çeviriyoruz
  let menuItems = japanItems.map((item) => {
    return `
      <div class="menu-items col-lg-6 col-sm-12">
        <img src="${item.img}" alt="${item.title}" class="photo">
        <div class="menu-info">
          <div class="menu-title">
            <h4>${item.title}</h4>
            <h4 class="price">${item.price}</h4>
          </div>
          <div class="menu-text">${item.desc}</div>
        </div>
      </div>
    `;
  });

  // Oluşturduğumuz HTML kodunu menü bölümüne ekliyoruz
  menuDiv.innerHTML = menuItems.join("");
}

// "China" butonuna tıklandığında sadece Çin yemeklerini gösteren fonksiyon
let chinaButton = document.querySelector("#china"); // "China" butonu seçiliyor
chinaButton.addEventListener("click", chinaMenu); // Butona tıklandığında chinaMenu fonksiyonu çağrılacak

// Sadece Çin yemeklerini gösteren fonksiyon
function chinaMenu() {
  // Çin yemeklerini filtrelemek için filter() fonksiyonunu kullanıyoruz
  let chinaItems = menu.filter((item) => item.category === "China");

  // Filtrelenen yemekleri HTML koduna çeviriyoruz
  let menuItems = chinaItems.map((item) => {
    return `
      <div class="menu-items col-lg-6 col-sm-12">
        <img src="${item.img}" alt="${item.title}" class="photo">
        <div class="menu-info">
          <div class="menu-title">
            <h4>${item.title}</h4>
            <h4 class="price">${item.price}</h4>
          </div>
          <div class="menu-text">${item.desc}</div>
        </div>
      </div>
    `;
  });

  // Oluşturduğumuz HTML kodunu menü bölümüne ekliyoruz
  menuDiv.innerHTML = menuItems.join("");
}
