import { BrowserRouter } from 'react-router-dom';
import AuthProvider from './components/authentication/AuthContext';
import Content from './components/content/Content';
import { StateProvider } from './components/store/storeContext';
import { reducer } from './components/store/storeReducer';


function App() {
  return (
  <AuthProvider>
    <StateProvider reducer={reducer} initialState={{}}>
      <BrowserRouter>
        <Content> </Content>
      </BrowserRouter>
    </StateProvider>
  </AuthProvider>
  );
}

export default App;
