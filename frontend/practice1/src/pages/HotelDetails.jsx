import Navbar from "../components/Navbar";
import Footer from "../components/Footer";
import RoomCard from "../components/RoomCard";

export default function HotelDetails() {
  const rooms = [
    { id: 1, type: "Deluxe Room", price: 4500 }
  ];

  return (
    <>
      <Navbar />
      <div className="container py-4">
        <h2>Grand Palace Hotel</h2>
        {rooms.map(room => (
          <RoomCard key={room.id} room={room} />
        ))}
      </div>
      <Footer />
    </>
  );
}