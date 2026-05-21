import { Link } from "react-router-dom";

export default function RoomCard({ room }) {
  return (
    <div className="card mb-3">
      <div className="card-body">
        <h5>{room.type}</h5>
        <p>₹{room.price}</p>
        <Link
          to={`/booking/${room.id}`}
          className="btn btn-success"
        >
          Book Now
        </Link>
      </div>
    </div>
  );
}