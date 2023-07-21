document.addEventListener("DOMContentLoaded", () => {
    
    // Sayfa yüklendiğinde yapılacak işlemleri içeren fonksiyon
    // Sayfanın DOM içeriği tamamen yüklendikten sonra çalıştırılır

    // Yapılacaklar listesi için list elementini ve yerel depolamadan alınan veriyi tanımlar
    let list = document.querySelector("#list");
    let todoList = localStorage.getItem("todolist");
    
    // Toast elementlerini ve "Ekle" düğmesini seçer
    const toasts = document.querySelectorAll("#liveToast");
    const btnadd = document.querySelector("#liveToastBtn");
    
    // Eğer yerel depolamada bir yapılacaklar listesi varsa, bu listeyi sayfada gösterir
    if(todoList) {
        list.innerHTML = JSON.parse(todoList);
    }
    
    // Yeni bir liste öğesi (görev) oluşturan fonksiyon
    function newElement() {   
        const li = document.createElement("li");
        let task = document.querySelector("#task").value.trim();
        
        // Eğer görev boşsa, "Lütfen bir görev girin" toast'ını gösterir ve fonksiyondan çıkar
        if(!task) {
            $(toasts[1]).toast('show');
            return;
        }
        
        // Girdi alanını temizler
        document.querySelector("#task").value = '';
        
        // Liste öğesinin metnini belirler
        li.textContent = task;
        
        // Liste öğesine tıklama olay dinleyicisi ekle, işaretleme durumunu değiştir ve yapılan değişiklikleri yerel depolamada günceller
        li.addEventListener("click", () => {    
            if (li.classList.contains("checked"))
                li.classList.remove("checked");
            else
                li.classList.add("checked");
            localStorage.setItem("todolist", JSON.stringify(list.innerHTML));
        });
        
        // Silme düğmesi oluşturur ve tıklama olay dinleyicisi ekle, liste öğesini kaldırır ve yapılan değişiklikleri yerel depolamada günceller
        const delspan = document.createElement("span");
        delspan.innerHTML = "&times;";
        delspan.classList.add("close");
        delspan.addEventListener("click", () => {
            removeElement(li);
        });
        
        // Silme düğmesini liste öğesine ekler ve liste öğesini listeye ekler
        li.appendChild(delspan);
        list.appendChild(li);
        
        // "Görev listeye eklendi" toast'ını gösterir
        $(toasts[0]).toast('show');
        
        // Yapılacaklar listesini günceller
        localStorage.setItem("todolist", JSON.stringify(list.innerHTML));
    };
    
    // Input alanına Enter tuşuna basılınca yeni bir liste öğesi oluştur
    document.querySelector('#task').addEventListener("keypress", (event) => {
        if(event.key === "Enter") newElement();
    });

    // Mevcut liste öğelerine tıklama olayı dinleyicisi ekler, işaretleme durumunu değiştirir ve yapılan değişiklikleri yerel depolamada günceller
    document.querySelectorAll("#list li").forEach((item) => { 
        item.addEventListener("click", () => {
            if(item.classList.contains("checked"))
                item.classList.remove("checked");
            else
                item.classList.add("checked");
            localStorage.setItem("todolist", JSON.stringify(list.innerHTML));
        });
    });

    // Her silme düğmesine tıklama olayı dinleyicisi ekler, ilgili liste öğesini kaldırır ve yapılan değişiklikleri yerel depolamada günceller
    document.querySelectorAll("#list span").forEach((item) => { 
        let li = item.parentNode;
        item.addEventListener("click", () => {
            removeElement(li);
        });
    });
        
    // "Ekle" düğmesine tıklama olayı dinleyicisi ekler, yeni bir liste öğesi oluştur
    btnadd.addEventListener("click", newElement);

    // Bir liste öğesini kaldıran fonksiyon, yapılan değişiklikleri yerel depolamada günceller
    function removeElement(li) {
        li.remove();
        localStorage.setItem("todolist", JSON.stringify(list.innerHTML));
    }
});
