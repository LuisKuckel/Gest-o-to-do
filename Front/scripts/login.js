document.addEventListener("DOMContentLoaded", () => {
    const formulario = document.querySelector("form");

    formulario.addEventListener('submit', (event) => {
        event.preventDefault();

        const email = document.querySelector('.email');
        const senha = document.querySelector('.password');

        logar(email.value, senha.value);
        email.value = "";
        senha.value = ""
    })
})

async function logar(email, senha) {
    try {
        const response = await fetch('http://localhost:8080/usuarios', {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json'
            }
        });
        const usuarios = await response.json();
        const usuarioEncontrado = usuarios.find(
            usuario => usuario.email === email && usuario.senha === senha
        );

        if (usuarioEncontrado) {
            alert('Login realizado com sucesso!');
            localStorage.setItem('usuario', JSON.stringify({
                id: usuarioEncontrado.id,
                nome: usuarioEncontrado.nome,
                email: usuarioEncontrado.email,
                senha: usuarioEncontrado.senha
            }));

            window.location.href = './pages/painel.html';
        } else {
            alert('Email ou senha incorretos.');
        }
    }
    catch (error) {
        console.error('Erro na requisição:', error);
        alert('Erro ao realizar login. Tente novamente.');
    }
    
}

