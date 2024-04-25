import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-lista-publicaciones-usuario-no-registrado-item')
export class VistaListaPublicacionesUsuarioNoRegistradoItem extends LitElement {
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
<vaadin-vertical-layout theme="spacing" id="publicacion" style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout class="content" style="height: 100%; width: 100%;" id="layoutPublicacion">
  <vaadin-vertical-layout id="vaadinVerticalLayout">
   <vaadin-vertical-layout theme="spacing-s" id="fotoPerfil">
    <vaadin-avatar id="vaadinAvatar"></vaadin-avatar>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="layoutVideoPublicacion" style="flex-grow: 1; flex-shrink: 0;">
   <vaadin-button theme="tertiary" id="botonNombreUsuario">
     NombreUsuario 
   </vaadin-button>
   <label id="labelGeolocalizacion">Geolocalización</label>
   <label id="numVisualizaciones" style="align-self: flex-end;">0</label>
   <vaadin-vertical-layout id="layoutVideo" style="align-self: stretch; flex-grow: 1; flex-shrink: 0;"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="layoutDatos" style="justify-content: center; flex-grow: 0; flex-shrink: 0;">
   <vaadin-horizontal-layout theme="spacing" id="layoutBotonesUsuarioR" style="align-self: stretch; justify-content: flex-end;">
    <vaadin-button id="botonSeguir">
      Seguir 
    </vaadin-button>
    <vaadin-button id="botonDenunciar">
      Denunciar 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing-xl" id="layoutBotonesPublicacion" style="align-self: flex-end; justify-content: center;">
    <vaadin-vertical-layout theme="spacing" id="layoutMeGustas">
     <label id="labelNumMeGustas" style="align-self: center;">0</label>
     <label id="labelMeGustas" style="align-self: center;">Numero Me Gustas</label>
     <vaadin-button id="vaadinButton" style="align-self: center;">
       Me Gusta 
     </vaadin-button>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" id="layoutComentarios">
     <label id="labelNumComentarios" style="align-self: center;">0</label>
     <vaadin-button id="botonVerComentarios" style="align-self: center;">
       Ver Comentarios 
     </vaadin-button>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <label id="labelDescripcion" style="flex-grow: 0; align-self: stretch;">Descripción de la publicación...</label>
   <vaadin-horizontal-layout theme="spacing-xs" id="layoutComentar" style="align-self: center;">
    <vaadin-text-field label="" placeholder="Escribe tu comentario..." id="textFieldComentario"></vaadin-text-field>
    <vaadin-button id="botonComentar">
      Comentar 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <hr id="lineaHorizontal" style="width: 99%; height: 2px;">
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
