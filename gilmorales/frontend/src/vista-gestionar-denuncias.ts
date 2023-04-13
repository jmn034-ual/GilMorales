import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';

@customElement('vista-gestionar-denuncias')
export class VistaGestionarDenuncias extends LitElement {
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
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="align-self: center; width: 80%; height: 70%;">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="align-self: center;">
   <h1 id="datos">Datos del administrador</h1>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 100%; height: 100%;">
   <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="width: 30%;">
    <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2" style="flex-grow: 1; width: 100%;">
     <vaadin-avatar id="fotoUsuario" style="width: 100%; height: 100%; flex-grow: 1; flex-shrink: 1;"></vaadin-avatar>
    </vaadin-horizontal-layout>
    <vaadin-button id="addFoto" style="align-self: center;">
      Añadir foto 
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout3" style="align-self: center;">
    <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3">
     <label id="nombre">Nombre</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout4">
     <label id="fecha">00/00/0000</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout5">
     <label id="código">Código </label>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout6" style="width: 50%; height: 30%; align-self: center; justify-content: flex-end; flex-grow: 0;">
    <vaadin-button id="verDenuncias" style="align-self: center;">
      Ver denuncias 
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
