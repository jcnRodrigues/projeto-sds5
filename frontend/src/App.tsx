import NavBar from "components/Navbar/index";
import Footer from "components/FootBar/index";
import DataTable from "components/DataTable/index";

function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary">Olá Mundo!!!</h1>
        <DataTable />
      </div>
      <Footer />
    </>
  );
}

export default App;
