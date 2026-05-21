import Navbar from "../components/Navbar";
import Footer from "../components/Footer";
import SearchBar from "../components/SearchBar";

export default function Home() {
  return (
    <>
      <Navbar />
      <div className="container py-5">
        <h1>Find Your Perfect Stay</h1>
        <SearchBar onSearch={(city) => console.log(city)} />
      </div>
      <Footer />
    </>
  );
}