import { useState } from "react";

export default function SearchBar({ onSearch }) {
  const [city, setCity] = useState("");

  return (
    <div className="row">
      <div className="col-md-10">
        <input
          className="form-control"
          placeholder="Search city"
          value={city}
          onChange={(e) => setCity(e.target.value)}
        />
      </div>
      <div className="col-md-2">
        <button
          className="btn btn-primary w-100"
          onClick={() => onSearch(city)}
        >
          Search
        </button>
      </div>
    </div>
  );
}