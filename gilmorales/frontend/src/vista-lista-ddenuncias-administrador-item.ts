import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-lista-ddenuncias-administrador-item')
export class VistaListaDdenunciasAdministradorItem extends LitElement {
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
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="align-self: center; width: 50%; height: 30%;">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="width: 40%; height: 100%;">
   <vaadin-avatar id="vaadinAvatar" style="width: 100%; height: 100%;"></vaadin-avatar>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="align-items: center;">
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2" style="align-self: center;">
    <vaadin-button theme="tertiary" id="nombreUsuario">
      NombreDeUsuario 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3" style="justify-content: center;">
    <label id="nombreCompleto">Nombre completo de usuario</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout4" style="justify-content: center;">
    <label id="estadoDenuncia">Estado denuncia</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout5" style="justify-content: center;">
    <label id="motivoDenuncia">Motivo de la denuncia</label>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
