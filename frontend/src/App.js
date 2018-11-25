import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

class App extends Component {
  state = {
    isLoading: true,
    gameList: {}
  };

  async componentDidMount() {
    const response = await fetch('/gamelist');
    const body = await response.json();
    this.setState({ gameList: body, isLoading: false });
  }

  render() {
    const {gameList, isLoading} = this.state;

    if (isLoading) {
      return <p>Loading...</p>;
    }

    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <div className="App-intro">
            <h2>Game List</h2>
              <div>
                {gameList.pacMan}
              </div>
              <div>
                {gameList.snake}
              </div>
          </div>
        </header>
      </div>
    );
  }
}

export default App;