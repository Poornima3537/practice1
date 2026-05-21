import { BrowserRouter, Routes, Route } from "react-router-dom";

import Home from "../pages/Home";
import Hotels from "../pages/Hotels";
import HotelDetails from "../pages/HotelDetails";
import Booking from "../pages/Booking";
import BookingHistory from "../pages/BookingHistory";
import Login from "../pages/Login";
import Register from "../pages/Register";
import Profile from "../pages/Profile";
import AdminDashboard from "../pages/AdminDashboard";
import NotFound from "../pages/NotFound";

import ProtectedRoute from "../components/ProtectedRoute";

function AppRoutes() {
  const isAuthenticated =
    localStorage.getItem("token") !== null;

  return (
    <BrowserRouter>
      <Routes>

        {/* Public Routes */}

        <Route
          path="/"
          element={<Home />}
        />

        <Route
          path="/hotels"
          element={<Hotels />}
        />

        <Route
          path="/hotel/:id"
          element={<HotelDetails />}
        />

        <Route
          path="/login"
          element={<Login />}
        />

        <Route
          path="/register"
          element={<Register />}
        />

        {/* Protected Routes */}

        <Route
          path="/booking/:roomId"
          element={
            <ProtectedRoute
              isAuthenticated={isAuthenticated}
            >
              <Booking />
            </ProtectedRoute>
          }
        />

        <Route
          path="/booking-history"
          element={
            <ProtectedRoute
              isAuthenticated={isAuthenticated}
            >
              <BookingHistory />
            </ProtectedRoute>
          }
        />

        <Route
          path="/profile"
          element={
            <ProtectedRoute
              isAuthenticated={isAuthenticated}
            >
              <Profile />
            </ProtectedRoute>
          }
        />

        <Route
          path="/admin"
          element={
            <ProtectedRoute
              isAuthenticated={isAuthenticated}
            >
              <AdminDashboard />
            </ProtectedRoute>
          }
        />

        {/* 404 */}

        <Route
          path="*"
          element={<NotFound />}
        />

      </Routes>
    </BrowserRouter>
  );
}

export default AppRoutes;