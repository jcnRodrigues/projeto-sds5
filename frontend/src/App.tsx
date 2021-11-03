import NavBar from "components/Navbar/index";
import Footer from "components/FootBar/index";
import DataTable from "components/DataTable/index";
import BarChart from "components/BarChart/index";
import DonutChart from "components/DonutChart/index";

function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary" py-3>
          Dashboard de Vendas
        </h1>
        <div className="row px-3">
          <div className="col-sm-6">
            <h5 className="text-secundary text-center">Taxa de Sucesso (%)</h5>
            <BarChart />
          </div>
          <div className="col-sm-6">
            <h5 className="text-secundary text-center">Todas as Vendas</h5>
            <DonutChart/>
          </div>
        </div>
        <div className="py-3">
          <h2 className="text-primary"> Todas as Vendas</h2>
        </div>
        <DataTable />
      </div>
      <Footer />
    </>
  );
}

export default App;
