export default function LoginForm() {
  return (
    <form>
      <input
        className="form-control mb-3"
        placeholder="Email"
      />
      <input
        type="password"
        className="form-control mb-3"
        placeholder="Password"
      />
      <button className="btn btn-primary">
        Login
      </button>
    </form>
  );
}