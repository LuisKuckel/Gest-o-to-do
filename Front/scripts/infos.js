
// --- Nome + Sair
document.addEventListener("DOMContentLoaded", () => {
    const saida = document.getElementById("botaoSair");
    const usuario = JSON.parse(localStorage.getItem('usuario'))

    if (usuario && usuario.nome) {
        document.querySelector(".user-name h2")
            .textContent = `Olá ${usuario.nome}`;
    } else {
        document.querySelector(".user-name h2")
            .textContent = `Olá ...`;
    }

    saida.addEventListener("click", () => {
        localStorage.clear();
        window.location.href = "../index.html"
    })
})

// --- Atividadtes
document.addEventListener("DOMContentLoaded", async () => {
    const response = await fetch('http://localhost:8080/atividades', {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json'
        }
    });

    const atividades = await response.json();
    const atividadesContainer = document.querySelector(".atividades");
    atividadesContainer.innerHTML = '';

    atividades.forEach(atividade => {
        console.log(atividade)
        const atividadeElement = document.createElement('div');
        atividadeElement.classList.add('atividade');

        const atividadeHTML = `
            <h3>${atividade.idmateria.nome}</h3>
            <p>${atividade.nome_atividade}</p>
        `;
        atividadeElement.innerHTML = atividadeHTML;

        atividadesContainer.appendChild(atividadeElement);
    });
});

document.addEventListener("DOMContentLoaded", async () => {
    const usuario = JSON.parse(localStorage.getItem('usuario'));  // Recuperando o usuário do localStorage
    
    const response = await fetch('http://localhost:8080/notas', {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json'
        }
    });

    const notas = await response.json();
    const notasDoUsuario = notas.filter(nota => nota.idusuario.id === usuario.id);
    const notasContainer = document.getElementById("areaNotas");

    if (notasDoUsuario.length > 0) {
        notasContainer.innerHTML = '';
        notasDoUsuario.forEach(nota => {
            const li = document.createElement('li');
            li.innerHTML = `${nota.idmateria.nome} <div class="separador-notas"></div> ${nota.nota}/10`;
            notasContainer.appendChild(li);
        });
    } else {
        notasContainer.innerHTML = '<p>Você ainda não tem notas registradas.</p>';
    }
});

