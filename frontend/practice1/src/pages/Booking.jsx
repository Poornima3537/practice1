import Navbar from "../components/Navbar";
import Footer from "../components/Footer";
import BookingForm from "../components/BookingForm";

export default function Booking() {
  return (
    <>
      <Navbar />
      <div className="container py-4">
        <h2>Booking</h2>
        <BookingForm />
      </div>
      <Footer />
    </>
  );
}