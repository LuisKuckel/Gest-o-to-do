document.addEventListener("DOMContentLoaded", function () {
  var calendarEl = document.getElementById("calendario");
  var calendar = new FullCalendar.Calendar(calendarEl, {
    initialView: "dayGridMonth",
    locale: "pt-br",
    headerToolbar: {
      left: "prev,next today",
      center: "title",
      right: "dayGridMonth,timeGridWeek,timeGridDay",
    },
    events: [
      {
        title: "Lista de Atividades: Potenciação",
        start: "2024-11-15",
      },
      {
        title: "Prova de Cálculo II",
        start: "2024-11-22",
      },
    ],
    events: [
      {
        title: "Feriado Nacional",
        start: "2024-11-20",
        display: "background", // Marca a data inteira
        color: "#f44336", // Fundo vermelho
      },
      {
        title: "Revisão Final",
        start: "2024-11-22",
        end: "2024-11-25",
        color: "#ff9800",
      },
    ],
  });
  calendar.render();
});
