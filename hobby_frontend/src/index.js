import React from 'react';
import ReactDOM from 'react-dom/client';
import App from './App';
import './index.css'; // 전체 스타일 (없으면 생략 가능)

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);