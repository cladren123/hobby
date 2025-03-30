import { useNavigate } from 'react-router-dom';
import './SubmitButton.css';

function SubmitButton({type, text}) {
    return <button type={type} className="submit-button"> {text} </button>
}
export default SubmitButton;