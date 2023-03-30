import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-usar-otra-cuenta')
export class VistaUsarOtraCuenta extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center;" id="vaadinVerticalLayout">
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="align-self: center; width: 50%; height: 70%;">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%; justify-content: center;">
   <h1 id="introducirDatosL">Introducir datos:</h1>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 100%; justify-content: center; height: 20%;">
   <vaadin-text-field label="Usuario" placeholder="Placeholder" id="usuarioTF" style="flex-grow: 1;"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2" style="width: 100%; justify-content: center; height: 20%;">
   <vaadin-password-field label="Contraseña" placeholder="Enter password" value="secret1" id="contrasenaTF" style="flex-grow: 1;" has-value></vaadin-password-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3" style="width: 100%; justify-content: center;">
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout4" style="align-items: center;">
    <vaadin-button id="cancelarB">
     Cancelar
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout5">
    <vaadin-button id="entrarB">
     Entrar 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
