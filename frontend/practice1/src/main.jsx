import React from "react";
import ReactDOM from "react-dom/client";
import App from "./App";

// Bootstrap
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap/dist/js/bootstrap.bundle.min.js";

// Global Styles
import "./index.css";
import "./assets/styles/global.css";
import "./assets/styles/navbar.css";
import "./assets/styles/home.css";
import "./assets/styles/hotels.css";
import "./assets/styles/booking.css";
import "./assets/styles/auth.css";
import "./assets/styles/profile.css";

ReactDOM.createRoot(document.getElementById("root")).render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);