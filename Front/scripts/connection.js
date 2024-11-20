const formulario = document.querySelector("form");
const Inome = document.querySelector(".nome");
const Iemail = document.querySelector(".email");
const Isenha = document.querySelector(".senha");

function cadastrar () {
    fetch("http://localhost:8080/usuarios",
        {
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json',
            },
            method: "POST",
            body: JSON.stringify({
                nome: Inome.value,
                email: Iemail.value,
                senha: Isenha.value
            })
        
        })
        .then(function (res) { 
            console.log(res) 
            if (!res.ok) {
                alert('Erro ao cadastrar. Status: ' + res.status);
            } else {
                alert('Cadastro realizado com sucesso!');
                window.location.href = "../index.html"
            }
        })
        .catch(function(res) {console.log(res) })
    
};

function limpar () {
    Inome.value = "";
    Iemail.value = "";
    Isenha.value = "";
};

formulario.addEventListener("submit", function(event){
    event.preventDefault();

    const email = document.querySelector('.email').value;
    const emailRegex = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/;

    if (emailRegex.test(email)) {
        cadastrar(); 
        limpar();

      } else {
        alert('Por favor, insira um email válido.');
      }
    

});

