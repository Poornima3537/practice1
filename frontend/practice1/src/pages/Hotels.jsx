import Navbar from "../components/Navbar";
import Footer from "../components/Footer";
import HotelCard from "../components/HotelCard";

const hotels = [
  {
    id: 1,
    name: "Grand Palace",
    city: "Mumbai",
    price: 4500,
    image: "/hotel1.jpg"
  }
];

export default function Hotels() {
  return (
    <>
      <Navbar />
      <div className="container py-4">
        <div className="row">
          {hotels.map(h => (
            <div className="col-md-4" key={h.id}>
              <HotelCard hotel={h} />
            </div>
          ))}
        </div>
      </div>
      <Footer />
    </>
  );
}