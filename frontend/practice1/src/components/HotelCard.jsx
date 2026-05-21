import { Link } from "react-router-dom";

export default function HotelCard({ hotel }) {
  return (
    <div className="card shadow">
      <img src={hotel.image} className="card-img-top" alt={hotel.name} />
      <div className="card-body">
        <h5>{hotel.name}</h5>
        <p>{hotel.city}</p>
        <p>₹{hotel.price}/night</p>
        <Link to={`/hotel/${hotel.id}`} className="btn btn-primary">
          View Details
        </Link>
      </div>
    </div>
  );
}