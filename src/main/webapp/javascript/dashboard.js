let username = sessionStorage.getItem("username");

if(username !== ""){
    fetchTrips(username);
}

function fetchTrips(username) {
    fetch('/get-trips').then(response => response.json()).then((trips) => {
        trips.forEach(
            (trip) => {
                displayTrips(trip.title, trip.totalBudget, trip.startDate, trip.endDate)});
    });
}

function displayTrips(title, totalBudget, startDate, endDate) {
    const trip = document.createElement("div");
    trip.className = "trip";

    var tripBox = 
        '<h3 class="trip-title">' + title + '</h3>'
        + '<p class="trip-info">' + totalBudget + '</p>'
        + '<p class="trip-info">' + startDate + '</p>'
        + '<p class="trip-info">' + endDate + '</p>';

    trip.innerHTML = tripBox;

    document.getElementById("trips-div").appendChild(trip);
}