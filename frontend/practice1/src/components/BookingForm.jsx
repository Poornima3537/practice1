export default function BookingForm() {
  return (
    <form>
      <input
        className="form-control mb-3"
        placeholder="Guest Name"
      />
      <input
        type="date"
        className="form-control mb-3"
      />
      <button className="btn btn-success">
        Confirm Booking
      </button>
    </form>
  );
}