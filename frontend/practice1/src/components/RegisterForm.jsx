export default function RegisterForm() {
  return (
    <form>
      <input className="form-control mb-2" placeholder="Name" />
      <input className="form-control mb-2" placeholder="Email" />
      <input
        type="password"
        className="form-control mb-2"
        placeholder="Password"
      />
      <button className="btn btn-success">
        Register
      </button>
    </form>
  );
}